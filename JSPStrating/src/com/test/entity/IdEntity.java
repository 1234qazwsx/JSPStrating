package com.test.entity;


public abstract class IdEntity
{

    public IdEntity()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    protected long id;
}
