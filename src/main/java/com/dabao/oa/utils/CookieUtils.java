package com.dabao.oa.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {

	public static Cookie getcookie(String string, Cookie[] cookies) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals(string)) {
				return cookie;
			}
		}
		
		return null;
	}

}
