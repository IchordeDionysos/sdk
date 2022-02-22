=begin
#Ory Oathkeeper API

#Documentation for all of Ory Oathkeeper's APIs. 

The version of the OpenAPI document: v0.8.0-alpha.1
Contact: hi@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

# Common files
require 'ory-keto-client/api_client'
require 'ory-keto-client/api_error'
require 'ory-keto-client/version'
require 'ory-keto-client/configuration'

# Models
require 'ory-keto-client/models/create_relation_tuple_bad_request_body'
require 'ory-keto-client/models/create_relation_tuple_internal_server_error_body'
require 'ory-keto-client/models/delete_relation_tuples_bad_request_body'
require 'ory-keto-client/models/delete_relation_tuples_internal_server_error_body'
require 'ory-keto-client/models/expand_tree'
require 'ory-keto-client/models/generic_error'
require 'ory-keto-client/models/get_check_bad_request_body'
require 'ory-keto-client/models/get_check_internal_server_error_body'
require 'ory-keto-client/models/get_check_response'
require 'ory-keto-client/models/get_expand_bad_request_body'
require 'ory-keto-client/models/get_expand_internal_server_error_body'
require 'ory-keto-client/models/get_expand_not_found_body'
require 'ory-keto-client/models/get_relation_tuples_internal_server_error_body'
require 'ory-keto-client/models/get_relation_tuples_not_found_body'
require 'ory-keto-client/models/get_relation_tuples_response'
require 'ory-keto-client/models/health_not_ready_status'
require 'ory-keto-client/models/health_status'
require 'ory-keto-client/models/inline_response200'
require 'ory-keto-client/models/inline_response2001'
require 'ory-keto-client/models/inline_response503'
require 'ory-keto-client/models/internal_relation_tuple'
require 'ory-keto-client/models/is_instance_alive_internal_server_error_body'
require 'ory-keto-client/models/patch_delta'
require 'ory-keto-client/models/patch_relation_tuples_bad_request_body'
require 'ory-keto-client/models/patch_relation_tuples_internal_server_error_body'
require 'ory-keto-client/models/patch_relation_tuples_not_found_body'
require 'ory-keto-client/models/post_check_bad_request_body'
require 'ory-keto-client/models/post_check_internal_server_error_body'
require 'ory-keto-client/models/relation_query'
require 'ory-keto-client/models/subject_set'
require 'ory-keto-client/models/version'

# APIs
require 'ory-keto-client/api/metadata_api'
require 'ory-keto-client/api/read_api'
require 'ory-keto-client/api/write_api'

module OryKetoClient
  class << self
    # Customize default settings for the SDK using block.
    #   OryKetoClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
