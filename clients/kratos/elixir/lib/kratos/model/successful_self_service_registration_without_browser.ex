# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Kratos.Model.SuccessfulSelfServiceRegistrationWithoutBrowser do
  @moduledoc """
  The Response for Registration Flows via API
  """

  @derive [Poison.Encoder]
  defstruct [
    :"identity",
    :"session",
    :"session_token"
  ]

  @type t :: %__MODULE__{
    :"identity" => Kratos.Model.Identity.t,
    :"session" => Kratos.Model.Session.t | nil,
    :"session_token" => String.t | nil
  }
end

defimpl Poison.Decoder, for: Kratos.Model.SuccessfulSelfServiceRegistrationWithoutBrowser do
  import Kratos.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"identity", :struct, Kratos.Model.Identity, options)
    |> deserialize(:"session", :struct, Kratos.Model.Session, options)
  end
end
