package com.dcjt.wps.modules.centerplatform.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Watermark {
       
    @JsonProperty("type")
    private Long type;
    
    @JsonProperty("value")
    private String value;
    
    @JsonProperty("fillstyle")
    private String fillstyle;
    
    @JsonProperty("font")
    private String font;
    
    @JsonProperty("rotate")
    private Long rotate;
    
    @JsonProperty("horizontal")
    private Long horizontal;
    
    @JsonProperty("vertical")
    private Long vertical;

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFillstyle() {
        return fillstyle;
    }

    public void setFillstyle(String fillstyle) {
        this.fillstyle = fillstyle;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public Long getRotate() {
        return rotate;
    }

    public void setRotate(Long rotate) {
        this.rotate = rotate;
    }

    public Long getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(Long horizontal) {
        this.horizontal = horizontal;
    }

    public Long getVertical() {
        return vertical;
    }

    public void setVertical(Long vertical) {
        this.vertical = vertical;
    }
    
}
