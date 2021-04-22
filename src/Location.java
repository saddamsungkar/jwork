
/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 25/03/2021
*/

public class Location 
{
    private String province; 
    private String city; 
    private String description; 
    
    /**
     * Constructor untuk object location
     * @param province provinsi pada location
     * @param city kota pada location
     * @param description deskripsi pada location
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * getter province dari location
     * @return dari province
     */
    public String getProvince()
    {
        return province;
    }
    
    /**
     * getter city dari location
     * @return dari city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * getter description dari location
     * @return dari description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * setter province dari location
     * @param province
     */
     public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * setter city dari location
     * @param city
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * setter description dari location
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * printData ini fungsi nya untuk nge print data pada location yang dipanggil pada JWork
     */
    public void printData()
    {
        System.out.println("===Lokasi===\n"+
        "Provinsi   =  "+province +"\n"+
        "Kota       =  "+city +"\n"+
        "Deskripsi  =  "+description
        );
    }
}
