package com.codionics.neogm.domain;

/**
 * Created by mmwaikar on 02-10-2015.
 */
public interface IARole {
    String getTitle();

    void setTitle(String title);

    IHomoSapiens getStart();

    void setStart(IHomoSapiens start);

    IHomoSapiens getEnd();

    void setEnd(IHomoSapiens end);
}
