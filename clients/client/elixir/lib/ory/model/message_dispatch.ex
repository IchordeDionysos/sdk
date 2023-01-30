# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.MessageDispatch do
  @moduledoc """
  MessageDispatch represents an attempt of sending a courier message It contains the status of the attempt (failed or successful) and the error if any occured
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :error,
    :id,
    :message_id,
    :status,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t,
    :error => map() | nil,
    :id => String.t,
    :message_id => String.t,
    :status => String.t,
    :updated_at => DateTime.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.MessageDispatch do
  def decode(value, _options) do
    value
  end
end

