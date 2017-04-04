package org.grails.plugins.springsession

import org.grails.web.util.WebUtils

import javax.servlet.http.HttpSession

class GrailsSessionProxy implements SessionProxy {

	@Override
	HttpSession getSession() {
		WebUtils.retrieveGrailsWebRequest().session
	}

}
