# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.UpdateLoginFlowWithOidcMethod do
  @moduledoc """
  Update Login Flow with OpenID Connect Method
  """

  @derive [Poison.Encoder]
  defstruct [
    :csrf_token,
    :method,
    :provider,
    :traits
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :method => String.t,
    :provider => String.t,
    :traits => map() | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.UpdateLoginFlowWithOidcMethod do
  def decode(value, _options) do
    value
  end
end

