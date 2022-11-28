/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.CreateIdentityBody;
import sh.ory.model.CreateRecoveryCodeForIdentityBody;
import sh.ory.model.CreateRecoveryLinkForIdentityBody;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.Identity;
import sh.ory.model.IdentitySchemaContainer;
import sh.ory.model.JsonPatch;
import sh.ory.model.RecoveryCodeForIdentity;
import sh.ory.model.RecoveryLinkForIdentity;
import sh.ory.model.Session;
import sh.ory.model.UpdateIdentityBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentityApi
 */
@Disabled
public class IdentityApiTest {

    private final IdentityApi api = new IdentityApi();

    /**
     * Create an Identity
     *
     * Create an [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model).  This endpoint can also be used to [import credentials](https://www.ory.sh/docs/kratos/manage-identities/import-user-accounts-identities) for instance passwords, social sign in configurations or multifactor methods.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createIdentityTest() throws ApiException {
        CreateIdentityBody createIdentityBody = null;
        Identity response = api.createIdentity(createIdentityBody);
        // TODO: test validations
    }

    /**
     * Create a Recovery Code
     *
     * This endpoint creates a recovery code which should be given to the user in order for them to recover (or activate) their account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRecoveryCodeForIdentityTest() throws ApiException {
        CreateRecoveryCodeForIdentityBody createRecoveryCodeForIdentityBody = null;
        RecoveryCodeForIdentity response = api.createRecoveryCodeForIdentity(createRecoveryCodeForIdentityBody);
        // TODO: test validations
    }

    /**
     * Create a Recovery Link
     *
     * This endpoint creates a recovery link which should be given to the user in order for them to recover (or activate) their account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRecoveryLinkForIdentityTest() throws ApiException {
        CreateRecoveryLinkForIdentityBody createRecoveryLinkForIdentityBody = null;
        RecoveryLinkForIdentity response = api.createRecoveryLinkForIdentity(createRecoveryLinkForIdentityBody);
        // TODO: test validations
    }

    /**
     * Delete an Identity
     *
     * Calling this endpoint irrecoverably and permanently deletes the [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) given its ID. This action can not be undone. This endpoint returns 204 when the identity was deleted or when the identity was not found, in which case it is assumed that is has been deleted already.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIdentityTest() throws ApiException {
        String id = null;
        api.deleteIdentity(id);
        // TODO: test validations
    }

    /**
     * Delete &amp; Invalidate an Identity&#39;s Sessions
     *
     * Calling this endpoint irrecoverably and permanently deletes and invalidates all sessions that belong to the given Identity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIdentitySessionsTest() throws ApiException {
        String id = null;
        api.deleteIdentitySessions(id);
        // TODO: test validations
    }

    /**
     * Deactivate a Session
     *
     * Calling this endpoint deactivates the specified session. Session data is not deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableSessionTest() throws ApiException {
        String id = null;
        api.disableSession(id);
        // TODO: test validations
    }

    /**
     * Extend a Session
     *
     * Calling this endpoint extends the given session ID. If &#x60;session.earliest_possible_extend&#x60; is set it will only extend the session after the specified time has passed.  Retrieve the session ID from the &#x60;/sessions/whoami&#x60; endpoint / &#x60;toSession&#x60; SDK method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void extendSessionTest() throws ApiException {
        String id = null;
        Session response = api.extendSession(id);
        // TODO: test validations
    }

    /**
     * Get an Identity
     *
     * Return an [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) by its ID. You can optionally include credentials (e.g. social sign in connections) in the response by using the &#x60;include_credential&#x60; query parameter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIdentityTest() throws ApiException {
        String id = null;
        List<String> includeCredential = null;
        Identity response = api.getIdentity(id, includeCredential);
        // TODO: test validations
    }

    /**
     * Get Identity JSON Schema
     *
     * Return a specific identity schema.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIdentitySchemaTest() throws ApiException {
        String id = null;
        Object response = api.getIdentitySchema(id);
        // TODO: test validations
    }

    /**
     * This endpoint returns the session object with expandables specified.
     *
     * This endpoint is useful for:  Getting a session object with all specified expandables that exist in an administrative context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSessionTest() throws ApiException {
        String id = null;
        List<String> expand = null;
        Session response = api.getSession(id, expand);
        // TODO: test validations
    }

    /**
     * List Identities
     *
     * Lists all [identities](https://www.ory.sh/docs/kratos/concepts/identity-user-model) in the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdentitiesTest() throws ApiException {
        Long perPage = null;
        Long page = null;
        List<Identity> response = api.listIdentities(perPage, page);
        // TODO: test validations
    }

    /**
     * Get all Identity Schemas
     *
     * Returns a list of all identity schemas currently in use.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdentitySchemasTest() throws ApiException {
        Long perPage = null;
        Long page = null;
        List<IdentitySchemaContainer> response = api.listIdentitySchemas(perPage, page);
        // TODO: test validations
    }

    /**
     * List an Identity&#39;s Sessions
     *
     * This endpoint returns all sessions that belong to the given Identity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdentitySessionsTest() throws ApiException {
        String id = null;
        Long perPage = null;
        Long page = null;
        Boolean active = null;
        List<Session> response = api.listIdentitySessions(id, perPage, page, active);
        // TODO: test validations
    }

    /**
     * List All Sessions
     *
     * Listing all sessions that exist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSessionsTest() throws ApiException {
        Long pageSize = null;
        String pageToken = null;
        Boolean active = null;
        List<String> expand = null;
        List<Session> response = api.listSessions(pageSize, pageToken, active, expand);
        // TODO: test validations
    }

    /**
     * Patch an Identity
     *
     * Partially updates an [identity&#39;s](https://www.ory.sh/docs/kratos/concepts/identity-user-model) field using [JSON Patch](https://jsonpatch.com/). The fields &#x60;id&#x60;, &#x60;stateChangedAt&#x60; and &#x60;credentials&#x60; can not be updated using this method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchIdentityTest() throws ApiException {
        String id = null;
        List<JsonPatch> jsonPatch = null;
        Identity response = api.patchIdentity(id, jsonPatch);
        // TODO: test validations
    }

    /**
     * Update an Identity
     *
     * This endpoint updates an [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model). The full identity payload (except credentials) is expected. It is possible to update the identity&#39;s credentials as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIdentityTest() throws ApiException {
        String id = null;
        UpdateIdentityBody updateIdentityBody = null;
        Identity response = api.updateIdentity(id, updateIdentityBody);
        // TODO: test validations
    }

}
