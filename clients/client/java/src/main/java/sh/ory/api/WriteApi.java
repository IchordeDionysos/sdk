/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.47
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiCallback;
import sh.ory.ApiClient;
import sh.ory.ApiException;
import sh.ory.ApiResponse;
import sh.ory.Configuration;
import sh.ory.Pair;
import sh.ory.ProgressRequestBody;
import sh.ory.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sh.ory.model.GenericError;
import sh.ory.model.PatchDelta;
import sh.ory.model.RelationQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WriteApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WriteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WriteApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createRelationTuple
     * @param relationQuery  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> relationQuery </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createRelationTupleCall(RelationQuery relationQuery, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = relationQuery;

        // create path and map variables
        String localVarPath = "/admin/relation-tuples";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryAccessToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createRelationTupleValidateBeforeCall(RelationQuery relationQuery, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createRelationTupleCall(relationQuery, _callback);
        return localVarCall;

    }

    /**
     * # Create a Relation Tuple
     * Use this endpoint to create a relation tuple.
     * @param relationQuery  (optional)
     * @return RelationQuery
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> relationQuery </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public RelationQuery createRelationTuple(RelationQuery relationQuery) throws ApiException {
        ApiResponse<RelationQuery> localVarResp = createRelationTupleWithHttpInfo(relationQuery);
        return localVarResp.getData();
    }

    /**
     * # Create a Relation Tuple
     * Use this endpoint to create a relation tuple.
     * @param relationQuery  (optional)
     * @return ApiResponse&lt;RelationQuery&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> relationQuery </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RelationQuery> createRelationTupleWithHttpInfo(RelationQuery relationQuery) throws ApiException {
        okhttp3.Call localVarCall = createRelationTupleValidateBeforeCall(relationQuery, null);
        Type localVarReturnType = new TypeToken<RelationQuery>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * # Create a Relation Tuple (asynchronously)
     * Use this endpoint to create a relation tuple.
     * @param relationQuery  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> relationQuery </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createRelationTupleAsync(RelationQuery relationQuery, final ApiCallback<RelationQuery> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRelationTupleValidateBeforeCall(relationQuery, _callback);
        Type localVarReturnType = new TypeToken<RelationQuery>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRelationTuples
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRelationTuplesCall(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/relation-tuples";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (subjectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_id", subjectId));
        }

        if (subjectSetNamespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.namespace", subjectSetNamespace));
        }

        if (subjectSetObject != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.object", subjectSetObject));
        }

        if (subjectSetRelation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.relation", subjectSetRelation));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryAccessToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteRelationTuplesValidateBeforeCall(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = deleteRelationTuplesCall(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, _callback);
        return localVarCall;

    }

    /**
     * # Delete Relation Tuples
     * Use this endpoint to delete relation tuples
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public void deleteRelationTuples(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation) throws ApiException {
        deleteRelationTuplesWithHttpInfo(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation);
    }

    /**
     * # Delete Relation Tuples
     * Use this endpoint to delete relation tuples
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteRelationTuplesWithHttpInfo(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation) throws ApiException {
        okhttp3.Call localVarCall = deleteRelationTuplesValidateBeforeCall(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * # Delete Relation Tuples (asynchronously)
     * Use this endpoint to delete relation tuples
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteRelationTuplesAsync(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRelationTuplesValidateBeforeCall(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchRelationTuples
     * @param patchDelta  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchRelationTuplesCall(List<PatchDelta> patchDelta, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = patchDelta;

        // create path and map variables
        String localVarPath = "/admin/relation-tuples";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryAccessToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchRelationTuplesValidateBeforeCall(List<PatchDelta> patchDelta, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = patchRelationTuplesCall(patchDelta, _callback);
        return localVarCall;

    }

    /**
     * # Patch Multiple Relation Tuples
     * Use this endpoint to patch one or more relation tuples.
     * @param patchDelta  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public void patchRelationTuples(List<PatchDelta> patchDelta) throws ApiException {
        patchRelationTuplesWithHttpInfo(patchDelta);
    }

    /**
     * # Patch Multiple Relation Tuples
     * Use this endpoint to patch one or more relation tuples.
     * @param patchDelta  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> patchRelationTuplesWithHttpInfo(List<PatchDelta> patchDelta) throws ApiException {
        okhttp3.Call localVarCall = patchRelationTuplesValidateBeforeCall(patchDelta, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * # Patch Multiple Relation Tuples (asynchronously)
     * Use this endpoint to patch one or more relation tuples.
     * @param patchDelta  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchRelationTuplesAsync(List<PatchDelta> patchDelta, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchRelationTuplesValidateBeforeCall(patchDelta, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
