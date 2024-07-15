package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pDetails")
public class PersonDetails {
	//getting the valus from properties
	@Value("{$per.id}")
	private String pid;
	@Value("{$per.name}")
	private String pname;
	@Value("{Sper.addrs}")
	private String paddrs;
	@Value("{$per.mobileNo}")
	private String phNo;
	
	//hardcoding
	@Value("alokpradhan7328@gamil.com")
	private String email;
	
	//injecting system properties value
	@Value("{$os.name}")
	private String os_name;
	@Value("{$os.version}")
	private String os_ver;
	
	//injecting env.. variable values
	@Value("{$Path}")
	private String path_data;

	//toString() fro objects data
	@Override
	public String toString() {
		return "PersonDetails [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", phNo=" + phNo + ", email="
				+ email + ", os_name=" + os_name + ", os_ver=" + os_ver + ", path_data=" + path_data + "]";
	}
	
	
}
