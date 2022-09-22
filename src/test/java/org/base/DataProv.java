package org.base;

import org.testng.annotations.DataProvider;

public class DataProv {

	// Syntax for " DataProvider "
				
		@DataProvider(name= "actors")
		
		private   Object[][] kamal() {
			
			return new  Object[][] {
				
				{"kama","kalai"},
				{"raja","rajnii"},
			};

		}		
		
	}
	
	
