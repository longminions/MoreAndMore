package MoreAndMore.ForHalogen.abstractservice;

import java.util.Date;

import MoreAndMore.ForHalogen.bean.ResponseBean;

public class BaseService extends AbstractService {
	
	public ResponseBean authen(String userid, String pwd) {
		Date date = new Date();
		if(pwd == null || pwd.trim() == "") {
			return ResponseBean.error("Password empty");
		}
	}
}
