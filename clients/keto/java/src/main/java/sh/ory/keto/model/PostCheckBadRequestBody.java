/*
 * Ory Oathkeeper API
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody post check bad request body
 */
@ApiModel(description = "PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody PostCheckBadRequestBody post check bad request body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-22T14:00:38.482701109Z[Etc/UTC]")
public class PostCheckBadRequestBody {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<Object> details = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public PostCheckBadRequestBody() { 
  }

  public PostCheckBadRequestBody code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public PostCheckBadRequestBody details(List<Object> details) {
    
    this.details = details;
    return this;
  }

  public PostCheckBadRequestBody addDetailsItem(Object detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "details")

  public List<Object> getDetails() {
    return details;
  }


  public void setDetails(List<Object> details) {
    this.details = details;
  }


  public PostCheckBadRequestBody message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PostCheckBadRequestBody reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reason")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public PostCheckBadRequestBody request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "request")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public PostCheckBadRequestBody status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCheckBadRequestBody postCheckBadRequestBody = (PostCheckBadRequestBody) o;
    return Objects.equals(this.code, postCheckBadRequestBody.code) &&
        Objects.equals(this.details, postCheckBadRequestBody.details) &&
        Objects.equals(this.message, postCheckBadRequestBody.message) &&
        Objects.equals(this.reason, postCheckBadRequestBody.reason) &&
        Objects.equals(this.request, postCheckBadRequestBody.request) &&
        Objects.equals(this.status, postCheckBadRequestBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, reason, request, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCheckBadRequestBody {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

