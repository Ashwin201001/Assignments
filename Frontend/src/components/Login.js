// Login.js
import React, { useState, useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate, useLocation, Link } from 'react-router-dom';
import { Container, Row, Col, Card, Form, Button, Alert } from 'react-bootstrap';
import { validateUsername, validatePassword, validateName, validateEmail, validatePhone } from '../utils/validators';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faArrowLeft } from '@fortawesome/free-solid-svg-icons';
import "../styles/Login.css";

 
const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [phone, setPhone] = useState('');
  const [usernameError, setUsernameError] = useState('');
  const [passwordError, setPasswordError] = useState('');
  const [nameError, setNameError] = useState('');
  const [emailError, setEmailError] = useState('');
  const [phoneError, setPhoneError] = useState('');
  const [isLogin, setIsLogin] = useState(true);
  const [isAdmin, setIsAdmin] = useState(false);
  const [error, setError] = useState('');
 
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const location = useLocation();
  const { error: authError, isAuthenticated, userRole } = useSelector((state) => state.auth);
 
  useEffect(() => {
    if (authError) {
      setError(authError);
    }
  }, [authError]);
 
  useEffect(() => {
    if (isAuthenticated) {
      const from = location.state?.from?.pathname || (userRole === 'ADMIN' ? '/admin' : '/customer');
      navigate(from, { replace: true });
    }
  }, [isAuthenticated, userRole, navigate, location]);
 
  const handleSubmit = async (e) => {
    e.preventDefault();
    setUsernameError('');
    setPasswordError('');
    setNameError('');
    setEmailError('');
    setPhoneError('');
    setError('');
 
    const usernameError = validateUsername(username);
    const passwordError = validatePassword(password);
 
    if (isLogin) {
      if (usernameError) setUsernameError(usernameError);
      if (passwordError) setPasswordError(passwordError);
 
      if (!usernameError && !passwordError) {
        try {
          if (isAdmin) {
            await dispatch(adminLogin(username, password));
          } else {
            await dispatch(customerLogin(username, password));
          }
        } catch (error) {
          // Error is now handled by the reducer and useEffect
        }
      }
    } else {
      const nameError = validateName(name);
      const emailError = validateEmail(email);
      const phoneError = validatePhone(phone);
 
      if (usernameError) setUsernameError(usernameError);
      if (passwordError) setPasswordError(passwordError);
      if (nameError) setNameError(nameError);
      if (emailError) setEmailError(emailError);
      if (phoneError) setPhoneError(phoneError);
 
      if (!usernameError && !passwordError && !nameError && !emailError && !phoneError) {
        try {
          await dispatch(customerSignup(name, email, phone, username, password));
          setIsLogin(true);
          setIsAdmin(false);
          setError('Signup successful. Please log in.');
        } catch (error) {
          // Error is now handled by the reducer and useEffect
        }
      }
    }
  };
 
  const toggleForm = () => {
    setIsLogin(!isLogin);
    setUsername('');
    setPassword('');
    setName('');
    setEmail('');
    setPhone('');
    setUsernameError('');
    setPasswordError('');
    setNameError('');
    setEmailError('');
    setPhoneError('');
    setError('');
    setIsAdmin(false);
  };
 
  const toggleRole = () => {
    if (!isLogin) return; // Prevent role toggle if in signup mode
    setIsAdmin(!isAdmin);
    setUsername('');
    setPassword('');
    setError('');
  };
 
  return (
    <div className="login-page">
      <div className="shapes-container">
        <div className="shape shape-1"></div>
        <div className="shape shape-2"></div>
        <div className="shape shape-3"></div>
        <div className="shape shape-4"></div>
        <div className="shape shape-5"></div>
        <div className="shape shape-6"></div>
      </div>
      <Container className="d-flex align-items-center justify-content-center min-vh-100">
        <Row className="justify-content-center w-100">
          <Col md={6}>
            <Card className="login-card">
              <Card.Header className="login-header d-flex justify-content-between align-items-center">
                <h4 className="mb-0">
                  {isAdmin ? 'Admin Login' : isLogin ? 'Customer Login' : 'Customer Signup'}
                </h4>
                <Link to="/" className="back-link">
                  <FontAwesomeIcon icon={faArrowLeft} /> Back to Home
                </Link>
              </Card.Header>
              <Card.Body>
                {error && <Alert variant="danger">{error}</Alert>}
                <Form onSubmit={handleSubmit}>
                  {!isLogin && (
                    <>
                      <Form.Group className="mb-3" controlId="name">
                        <Form.Label>Name</Form.Label>
                        <Form.Control
                          type="text"
                          value={name}
                          onChange={(e) => setName(e.target.value)}
                          isInvalid={!!nameError}
                        />
                        <Form.Control.Feedback type="invalid">{nameError}</Form.Control.Feedback>
                      </Form.Group>
                      <Form.Group className="mb-3" controlId="email">
                        <Form.Label>Email</Form.Label>
                        <Form.Control
                          type="email"
                          value={email}
                          onChange={(e) => setEmail(e.target.value)}
                          isInvalid={!!emailError}
                        />
                        <Form.Control.Feedback type="invalid">{emailError}</Form.Control.Feedback>
                      </Form.Group>
                      <Form.Group className="mb-3" controlId="phone">
                        <Form.Label>Phone</Form.Label>
                        <Form.Control
                          type="tel"
                          value={phone}
                          onChange={(e) => setPhone(e.target.value)}
                          isInvalid={!!phoneError}
                        />
                        <Form.Control.Feedback type="invalid">{phoneError}</Form.Control.Feedback>
                      </Form.Group>
                    </>
                  )}
                  <Form.Group className="mb-3" controlId="username">
                    <Form.Label>Username</Form.Label>
                    <Form.Control
                      type="text"
                      value={username}
                      onChange={(e) => setUsername(e.target.value)}
                      isInvalid={!!usernameError}
                    />
                    <Form.Control.Feedback type="invalid">{usernameError}</Form.Control.Feedback>
                  </Form.Group>
                  <Form.Group className="mb-3" controlId="password">
                    <Form.Label>Password</Form.Label>
                    <Form.Control
                      type="password"
                      value={password}
                      onChange={(e) => setPassword(e.target.value)}
                      isInvalid={!!passwordError}
                    />
                    <Form.Control.Feedback type="invalid">{passwordError}</Form.Control.Feedback>
                  </Form.Group>
                  <div className="d-grid">
                    <Button variant="primary" type="submit" className="login-button">
                      {isLogin ? 'Login' : 'Signup'}
                    </Button>
                  </div>
                </Form>
                <div className="mt-3 text-center">
                  {isLogin ? (
                    <p>
                      Don't have an account?{' '}
                      <Button variant="link" onClick={toggleForm}>
                        Sign Up
                      </Button>
                    </p>
                  ) : (
                    <p>
                      Already have an account?{' '}
                      <Button variant="link" onClick={toggleForm}>
                        Login
                      </Button>
                    </p>
                  )}
                  {isLogin && (
                    <p>
                      {isAdmin ? 'Customer' : 'Admin'}?{' '}
                      <Button variant="link" onClick={toggleRole}>
                        Switch to {isAdmin ? 'Customer' : 'Admin'} Login
                      </Button>
                    </p>
                  )}
                </div>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    </div>
  );
};
 
export default Login;