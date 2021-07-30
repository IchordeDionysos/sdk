/*
 * ORY Keto
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.6.0-alpha.6
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
import sh.ory.keto.model.InternalRelationTuple;

/**
 * PatchDelta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T10:39:35.128184899Z[Etc/UTC]")
public class PatchDelta {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_RELATION_TUPLE = "relation_tuple";
  @SerializedName(SERIALIZED_NAME_RELATION_TUPLE)
  private InternalRelationTuple relationTuple;


  public PatchDelta action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public PatchDelta relationTuple(InternalRelationTuple relationTuple) {
    
    this.relationTuple = relationTuple;
    return this;
  }

   /**
   * Get relationTuple
   * @return relationTuple
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InternalRelationTuple getRelationTuple() {
    return relationTuple;
  }


  public void setRelationTuple(InternalRelationTuple relationTuple) {
    this.relationTuple = relationTuple;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchDelta patchDelta = (PatchDelta) o;
    return Objects.equals(this.action, patchDelta.action) &&
        Objects.equals(this.relationTuple, patchDelta.relationTuple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, relationTuple);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchDelta {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    relationTuple: ").append(toIndentedString(relationTuple)).append("\n");
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

