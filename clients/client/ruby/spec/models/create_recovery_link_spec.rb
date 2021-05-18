=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.1
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.1.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryHydraClient::CreateRecoveryLink
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryHydraClient::CreateRecoveryLink do
  let(:instance) { OryHydraClient::CreateRecoveryLink.new }

  describe 'test an instance of CreateRecoveryLink' do
    it 'should create an instance of CreateRecoveryLink' do
      expect(instance).to be_instance_of(OryHydraClient::CreateRecoveryLink)
    end
  end
  describe 'test attribute "expires_in"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "identity_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end