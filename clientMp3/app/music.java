// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `server.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package app;

public class music implements java.lang.Cloneable,
                              java.io.Serializable
{
    public String name;

    public String genre;

    public String author;

    public String url;

    public music()
    {
        this.name = "";
        this.genre = "";
        this.author = "";
        this.url = "";
    }

    public music(String name, String genre, String author, String url)
    {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.url = url;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        music r = null;
        if(rhs instanceof music)
        {
            r = (music)rhs;
        }

        if(r != null)
        {
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
                {
                    return false;
                }
            }
            if(this.genre != r.genre)
            {
                if(this.genre == null || r.genre == null || !this.genre.equals(r.genre))
                {
                    return false;
                }
            }
            if(this.author != r.author)
            {
                if(this.author == null || r.author == null || !this.author.equals(r.author))
                {
                    return false;
                }
            }
            if(this.url != r.url)
            {
                if(this.url == null || r.url == null || !this.url.equals(r.url))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::app::music");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, genre);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, author);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, url);
        return h_;
    }

    public music clone()
    {
        music c = null;
        try
        {
            c = (music)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.name);
        ostr.writeString(this.genre);
        ostr.writeString(this.author);
        ostr.writeString(this.url);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.name = istr.readString();
        this.genre = istr.readString();
        this.author = istr.readString();
        this.url = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, music v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public music ice_read(com.zeroc.Ice.InputStream istr)
    {
        music v = new music();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<music> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, music v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<music> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(music.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final music _nullMarshalValue = new music();

    public static final long serialVersionUID = 799243785L;
}