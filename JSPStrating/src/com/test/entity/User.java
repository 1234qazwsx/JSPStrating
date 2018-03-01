package com.test.entity;


// Referenced classes of package com.test.entity:
//            IdEntity

public class User extends IdEntity
{

    public User()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPasswword()
    {
        return passwword;
    }

    public void setPasswword(String passwword)
    {
        this.passwword = passwword;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String toString()
    {
        return (new StringBuilder("user [name=")).append(name).append(", passwword=").append(passwword).append(", email=").append(email).append(", id=").append(id).append("]").toString();
    }

    private String name;
    private String passwword;
    private String email;
}
