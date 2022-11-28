"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.0.0-alpha.0
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.identity_state import IdentityState
from ory_client.model.identity_with_credentials import IdentityWithCredentials
from ory_client.model.recovery_identity_address import RecoveryIdentityAddress
from ory_client.model.verifiable_identity_address import VerifiableIdentityAddress
globals()['IdentityState'] = IdentityState
globals()['IdentityWithCredentials'] = IdentityWithCredentials
globals()['RecoveryIdentityAddress'] = RecoveryIdentityAddress
globals()['VerifiableIdentityAddress'] = VerifiableIdentityAddress
from ory_client.model.create_identity_body import CreateIdentityBody


class TestCreateIdentityBody(unittest.TestCase):
    """CreateIdentityBody unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCreateIdentityBody(self):
        """Test CreateIdentityBody"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CreateIdentityBody()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
