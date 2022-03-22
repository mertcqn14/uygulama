package ibmtal.trendyol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myAccount")
public class Options {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="homePage")
	private String homePage;
	@Column(name="shoe")
	private String shoe;
	@Column(name="jumper")
	private String jumper;
	@Column(name="pants")
	private String pants;
	@Column(name="sweatshirt")
	private String sweatshirt;
	@Column(name="glove")
	private String glove;
	@Column(name="shorts")
	private String shorts;
	@Column(name="slipper")
	private String slipper;
	@Column(name="boots")
	private String boots;
	@Column(name="coats")
	private String coats;
	@Column(name="sock")
	private String sock;
	@Column(name="coat")
	private String coat;
	@Column(name="tablet")
	private String tablet;
	@Column(name="phone")
	private String phone;
	@Column(name="computer")
	private String computer;
	@Column(name="TV")
	private String TV;
	@Column(name="smartWatch")
	private String smartWatch;
	@Column(name="bike")
	private String bike;
	public Options() {
		super();
	}
	public Options(int id, String homePage, String shoe, String jumper, String pants, String sweatshirt, String glove,
			String shorts, String slipper, String boots, String coats, String sock, String coat, String tablet,
			String phone, String computer, String tV, String smartWatch, String bike) {
		super();
		this.id = id;
		this.homePage = homePage;
		this.shoe = shoe;
		this.jumper = jumper;
		this.pants = pants;
		this.sweatshirt = sweatshirt;
		this.glove = glove;
		this.shorts = shorts;
		this.slipper = slipper;
		this.boots = boots;
		this.coats = coats;
		this.sock = sock;
		this.coat = coat;
		this.tablet = tablet;
		this.phone = phone;
		this.computer = computer;
		TV = tV;
		this.smartWatch = smartWatch;
		this.bike = bike;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public String getShoe() {
		return shoe;
	}
	public void setShoe(String shoe) {
		this.shoe = shoe;
	}
	public String getJumper() {
		return jumper;
	}
	public void setJumper(String jumper) {
		this.jumper = jumper;
	}
	public String getPants() {
		return pants;
	}
	public void setPants(String pants) {
		this.pants = pants;
	}
	public String getSweatshirt() {
		return sweatshirt;
	}
	public void setSweatshirt(String sweatshirt) {
		this.sweatshirt = sweatshirt;
	}
	public String getGlove() {
		return glove;
	}
	public void setGlove(String glove) {
		this.glove = glove;
	}
	public String getShorts() {
		return shorts;
	}
	public void setShorts(String shorts) {
		this.shorts = shorts;
	}
	public String getSlipper() {
		return slipper;
	}
	public void setSlipper(String slipper) {
		this.slipper = slipper;
	}
	public String getBoots() {
		return boots;
	}
	public void setBoots(String boots) {
		this.boots = boots;
	}
	public String getCoats() {
		return coats;
	}
	public void setCoats(String coats) {
		this.coats = coats;
	}
	public String getSock() {
		return sock;
	}
	public void setSock(String sock) {
		this.sock = sock;
	}
	public String getCoat() {
		return coat;
	}
	public void setCoat(String coat) {
		this.coat = coat;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		this.computer = computer;
	}
	public String getTV() {
		return TV;
	}
	public void setTV(String tV) {
		TV = tV;
	}
	public String getSmartWatch() {
		return smartWatch;
	}
	public void setSmartWatch(String smartWatch) {
		this.smartWatch = smartWatch;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	
	
}
