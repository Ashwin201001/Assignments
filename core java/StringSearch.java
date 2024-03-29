package com.ashwin;

public class StringSearch extends AbstractSearch{
	 
	@Override
	public boolean search(Object[] obj_list, Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof String) {
            String target = (String) obj;
            for (Object item : obj_list) {
                if (item instanceof String && (String) item == target) {
                    return true;
                }
            }
        }
		return false;
	}
}