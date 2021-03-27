/**
 * @author : Muhammad Saddam
 * @version : Modul3 - 18/03/2021
*/

public class Location
{
    /**
    Deklarasi Variable 
    */
    private String province;
    private String city;
    private String description;

     /**
     * constructor dari location
     * @param province provinsi dari location
     * @param city kota dari location
     * @param description dari location
     */
    public Location(String province, String city, String Description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    
    /**
    * getter provinsi dari location
    * @return province dari location
    */
    public String getProvince(){
        return province;
    }
    
    /**
    * getter kota dari location
    * @return city dari location
    */
    public String getCity(){
        return city;
    }
    
    /**
    * getter deskripsi dari location
    * @return description dari location
    */
    public String getDescription(){
        return description;
    }
    
    /**
    * setter provinsi dari location
    * @param province dari location
    */
    public void setProvince(String province) { 
        this.province = province; 
    }
    
    /**
    * setter kota dari location
    * @param city dari location
    */
    public void setCity(String city) { 
        this.city = city; 
    }
    
    /**
    * setter deskripsi dari location
    * @param description dari location
    */
    public void setDescription(String description) { 
        this.description=description; 
    }
    
    /**
    * mencetak nama provinsi
    */
    public void printData() {
        System.out.println("Nama Provinsi : "+ province);
    }
}
