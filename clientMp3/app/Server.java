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

public interface Server extends com.zeroc.Ice.Object
{
    String addDocument(music music, com.zeroc.Ice.Current current);

    String removeDocument(String name, com.zeroc.Ice.Current current);

    music[] displayListMusic(com.zeroc.Ice.Current current);

    music[] searchDocument(String attribute, String name, com.zeroc.Ice.Current current);

    byte[] downloadDocument(music music, com.zeroc.Ice.Current current);

    void LibvlcPlayerPlay(String name, com.zeroc.Ice.Current current);

    void LibvlcPlayerStop(com.zeroc.Ice.Current current);

    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::app::Server"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::app::Server";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_addDocument(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        music iceP_music;
        iceP_music = music.ice_read(istr);
        inS.endReadParams();
        String ret = obj.addDocument(iceP_music, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeString(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_removeDocument(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_name;
        iceP_name = istr.readString();
        inS.endReadParams();
        String ret = obj.removeDocument(iceP_name, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeString(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_displayListMusic(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        music[] ret = obj.displayListMusic(current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        tabHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_searchDocument(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_attribute;
        String iceP_name;
        iceP_attribute = istr.readString();
        iceP_name = istr.readString();
        inS.endReadParams();
        music[] ret = obj.searchDocument(iceP_attribute, iceP_name, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        tabHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_downloadDocument(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        music iceP_music;
        iceP_music = music.ice_read(istr);
        inS.endReadParams();
        byte[] ret = obj.downloadDocument(iceP_music, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeByteSeq(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_LibvlcPlayerPlay(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_name;
        iceP_name = istr.readString();
        inS.endReadParams();
        obj.LibvlcPlayerPlay(iceP_name, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_LibvlcPlayerStop(Server obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        obj.LibvlcPlayerStop(current);
        return inS.setResult(inS.writeEmptyParams());
    }

    final static String[] _iceOps =
    {
        "LibvlcPlayerPlay",
        "LibvlcPlayerStop",
        "addDocument",
        "displayListMusic",
        "downloadDocument",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "removeDocument",
        "searchDocument"
    };

    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_LibvlcPlayerPlay(this, in, current);
            }
            case 1:
            {
                return _iceD_LibvlcPlayerStop(this, in, current);
            }
            case 2:
            {
                return _iceD_addDocument(this, in, current);
            }
            case 3:
            {
                return _iceD_displayListMusic(this, in, current);
            }
            case 4:
            {
                return _iceD_downloadDocument(this, in, current);
            }
            case 5:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 6:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 7:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 8:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 9:
            {
                return _iceD_removeDocument(this, in, current);
            }
            case 10:
            {
                return _iceD_searchDocument(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
