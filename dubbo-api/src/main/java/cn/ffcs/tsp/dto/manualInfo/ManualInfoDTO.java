package cn.ffcs.tsp.dto.manualInfo;

import java.io.Serializable;

public class ManualInfoDTO  implements Serializable {

	private static final long serialVersionUID = 1L;

	private String autoEnterpriseCode ;
	
	private String manualType ;

	public String getAutoEnterpriseCode() {
		return autoEnterpriseCode;
	}

	public void setAutoEnterpriseCode(String autoEnterpriseCode) {
		this.autoEnterpriseCode = autoEnterpriseCode;
	}

	public String getManualType() {
		return manualType;
	}

	public void setManualType(String manualType) {
		this.manualType = manualType;
	}
	
	
}
