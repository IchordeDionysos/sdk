"""
    ORY Keto

    Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.  # noqa: E501

    The version of the OpenAPI document: v0.6.0-alpha.6
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from ory_keto_client.api_client import ApiClient, Endpoint as _Endpoint
from ory_keto_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from ory_keto_client.model.expand_tree import ExpandTree
from ory_keto_client.model.get_check_response import GetCheckResponse
from ory_keto_client.model.get_relation_tuples_response import GetRelationTuplesResponse
from ory_keto_client.model.inline_response400 import InlineResponse400
from ory_keto_client.model.internal_relation_tuple import InternalRelationTuple


class ReadApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __get_check(
            self,
            namespace,
            object,
            relation,
            **kwargs
        ):
            """Check a relation tuple  # noqa: E501

            To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_check(namespace, object, relation, async_req=True)
            >>> result = thread.get()

            Args:
                namespace (str): Namespace of the Relation Tuple
                object (str): Object of the Relation Tuple
                relation (str): Relation of the Relation Tuple

            Keyword Args:
                subject (str): Subject of the Relation Tuple  The subject follows the subject string encoding format.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                GetCheckResponse
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['namespace'] = \
                namespace
            kwargs['object'] = \
                object
            kwargs['relation'] = \
                relation
            return self.call_with_http_info(**kwargs)

        self.get_check = _Endpoint(
            settings={
                'response_type': (GetCheckResponse,),
                'auth': [],
                'endpoint_path': '/check',
                'operation_id': 'get_check',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'namespace',
                    'object',
                    'relation',
                    'subject',
                ],
                'required': [
                    'namespace',
                    'object',
                    'relation',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'namespace':
                        (str,),
                    'object':
                        (str,),
                    'relation':
                        (str,),
                    'subject':
                        (str,),
                },
                'attribute_map': {
                    'namespace': 'namespace',
                    'object': 'object',
                    'relation': 'relation',
                    'subject': 'subject',
                },
                'location_map': {
                    'namespace': 'query',
                    'object': 'query',
                    'relation': 'query',
                    'subject': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_check
        )

        def __get_expand(
            self,
            namespace,
            object,
            relation,
            **kwargs
        ):
            """Expand a Relation Tuple  # noqa: E501

            Use this endpoint to expand a relation tuple.  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_expand(namespace, object, relation, async_req=True)
            >>> result = thread.get()

            Args:
                namespace (str): Namespace of the Relation Tuple
                object (str): Object of the Relation Tuple
                relation (str): Relation of the Relation Tuple

            Keyword Args:
                max_depth (int): [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                ExpandTree
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['namespace'] = \
                namespace
            kwargs['object'] = \
                object
            kwargs['relation'] = \
                relation
            return self.call_with_http_info(**kwargs)

        self.get_expand = _Endpoint(
            settings={
                'response_type': (ExpandTree,),
                'auth': [],
                'endpoint_path': '/expand',
                'operation_id': 'get_expand',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'namespace',
                    'object',
                    'relation',
                    'max_depth',
                ],
                'required': [
                    'namespace',
                    'object',
                    'relation',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'namespace':
                        (str,),
                    'object':
                        (str,),
                    'relation':
                        (str,),
                    'max_depth':
                        (int,),
                },
                'attribute_map': {
                    'namespace': 'namespace',
                    'object': 'object',
                    'relation': 'relation',
                    'max_depth': 'max-depth',
                },
                'location_map': {
                    'namespace': 'query',
                    'object': 'query',
                    'relation': 'query',
                    'max_depth': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_expand
        )

        def __get_relation_tuples(
            self,
            namespace,
            **kwargs
        ):
            """Query relation tuples  # noqa: E501

            Get all relation tuples that match the query. Only the namespace field is required.  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_relation_tuples(namespace, async_req=True)
            >>> result = thread.get()

            Args:
                namespace (str):

            Keyword Args:
                object (str): [optional]
                relation (str): [optional]
                subject (str): [optional]
                page_token (str): [optional]
                page_size (int): [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                GetRelationTuplesResponse
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['namespace'] = \
                namespace
            return self.call_with_http_info(**kwargs)

        self.get_relation_tuples = _Endpoint(
            settings={
                'response_type': (GetRelationTuplesResponse,),
                'auth': [],
                'endpoint_path': '/relation-tuples',
                'operation_id': 'get_relation_tuples',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'namespace',
                    'object',
                    'relation',
                    'subject',
                    'page_token',
                    'page_size',
                ],
                'required': [
                    'namespace',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'namespace':
                        (str,),
                    'object':
                        (str,),
                    'relation':
                        (str,),
                    'subject':
                        (str,),
                    'page_token':
                        (str,),
                    'page_size':
                        (int,),
                },
                'attribute_map': {
                    'namespace': 'namespace',
                    'object': 'object',
                    'relation': 'relation',
                    'subject': 'subject',
                    'page_token': 'page_token',
                    'page_size': 'page_size',
                },
                'location_map': {
                    'namespace': 'query',
                    'object': 'query',
                    'relation': 'query',
                    'subject': 'query',
                    'page_token': 'query',
                    'page_size': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_relation_tuples
        )

        def __post_check(
            self,
            **kwargs
        ):
            """Check a relation tuple  # noqa: E501

            To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.post_check(async_req=True)
            >>> result = thread.get()


            Keyword Args:
                payload (InternalRelationTuple): [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                GetCheckResponse
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            return self.call_with_http_info(**kwargs)

        self.post_check = _Endpoint(
            settings={
                'response_type': (GetCheckResponse,),
                'auth': [],
                'endpoint_path': '/check',
                'operation_id': 'post_check',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'payload',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'payload':
                        (InternalRelationTuple,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'payload': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__post_check
        )
