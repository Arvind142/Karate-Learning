package com.prac.Practice.oct8;

import com.intuit.karate.junit5.Karate;

class UsersRunner {

	@Karate.Test
	Karate testUsers() {
		//run all cases from featurefile name give in run method present in same package
		return Karate.run("users").relativeTo(getClass());
	}
}
