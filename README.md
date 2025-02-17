# Groovy NullPointerException with Unexpected Return Types

This example demonstrates a potential pitfall in Groovy when dealing with null values and method return types.

The `myMethod` function is designed to handle null input, but directly returning 0 will work correctly only if the expected return type is a primitive type. If the expected return type is a more complex object, this will lead to a runtime error.

The solution shows how to handle null checks gracefully and ensure type safety by returning null or a suitable default value of the expected type.