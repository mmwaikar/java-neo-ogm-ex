package com.codionics.neogm.domain;

/**
 * Created by mmwaikar on 02-10-2015.
 */
public interface IDerivedARole {
    String getTitle();

    void setTitle(String title);

    IDerivedHomoSapiens getStart();

    void setStart(IDerivedHomoSapiens start);

    IDerivedHomoSapiens getEnd();

    void setEnd(IDerivedHomoSapiens end);
}
