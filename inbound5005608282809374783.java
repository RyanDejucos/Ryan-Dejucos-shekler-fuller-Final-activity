function safeDivide(a, b) {
    if (b === 0) {
        console.log("Error: Division by zero is not allowed.");
        return null;
    } else {
        return a / b;
    }
}

// Example usage:
let result = safeDivide(10, 2);
console.log(result);  // Output: 5

result = safeDivide(10, 0);
console.log(result);  // Output: null, with an error message
