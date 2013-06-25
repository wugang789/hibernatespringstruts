package com.cn.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class schemaExport {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure();
		SchemaExport se=new SchemaExport(con);
		se.create(true, true);
		
	}
}
