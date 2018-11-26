package com.mage.swagger_restful.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "测试模型实体")
public class Test {
    @ApiModelProperty(name = "id", value = "主键", hidden = true)
    private Integer id;
    @ApiModelProperty(name = "content", value = "测试内容")
    private String content;
    @ApiModelProperty(name = "isValid", value = "是否有效0=无效，1=有效", hidden = true)
    private Integer isValid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
