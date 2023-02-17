package member;

public class ZipcodeBean {/*테이블명 + Bean*/
	
	private String zipcode;
	private String area1;
	private String area2;
	private String area3;
	
	
	//gettter: get + 변수명(Xxxxx)
	public String getZipcode() {
		return zipcode;
	}
	//setter: set + 변수명(Xxxxx)
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	
}
