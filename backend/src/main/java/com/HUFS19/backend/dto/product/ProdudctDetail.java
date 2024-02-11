package com.HUFS19.backend.dto.product;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
public class ProdudctDetail {
    private int id;
    private String name;
    private String uploader;
    private int categoryId;
    private String detail;
    private String mainImg;
    private Timestamp date;
    private boolean isViewerEqualUploader;
}
