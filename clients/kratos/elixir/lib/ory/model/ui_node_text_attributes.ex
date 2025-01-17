# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UiNodeTextAttributes do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :node_type,
    :text
  ]

  @type t :: %__MODULE__{
    :id => String.t,
    :node_type => String.t,
    :text => Ory.Model.UiText.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.UiNodeTextAttributes do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:text, :struct, Ory.Model.UiText, options)
  end
end

