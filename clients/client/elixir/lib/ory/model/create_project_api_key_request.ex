# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CreateProjectApiKeyRequest do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :name
  ]

  @type t :: %__MODULE__{
    :name => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.CreateProjectApiKeyRequest do
  def decode(value, _options) do
    value
  end
end

