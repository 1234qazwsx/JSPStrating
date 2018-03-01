
package com.test.entity;


// Referenced classes of package com.test.entity:
//            IdEntity

public class Address extends IdEntity
{

    public Address()
    {
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    public String toString()
    {
        return (new StringBuilder("Address [city=")).append(city).append(", country=").append(country).append(", userId=").append(userId).append(", id=").append(id).append("]").toString();
    }

    private String city;
    private String country;
    private long userId;
}
