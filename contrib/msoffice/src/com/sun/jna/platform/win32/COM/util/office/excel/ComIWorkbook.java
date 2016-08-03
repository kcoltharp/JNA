package com.sun.jna.platform.win32.COM.util.office.excel;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

@ComInterface(iid="{0002096B-0000-0000-C000-000000000046}")
public interface ComIWorkbook {

	@ComMethod
	void Close(boolean saveChanges);

        @ComProperty
        ComIWorksheet getActiveSheet();
        
        @ComMethod
        void Save();
        
        @ComMethod
        void SaveAs(String filename);
        
        @ComProperty
        Charts getCharts();
}
