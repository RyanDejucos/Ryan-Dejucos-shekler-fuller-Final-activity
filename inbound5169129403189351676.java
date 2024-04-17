function getElementAtIndex(array, index) {
    try {
        if (index < 0 || index >= array.length) {
            throw new Error("Index out of bounds");
        }
        return array[index];
    } catch (error) {
        return "Error: " + error.message;
    }
}

// Example usage:
const arr = [1, 2, 3, 4, 5];
console.log(getElementAtIndex(arr, 2));  // Output: 3
console.log(getElementAtIndex(arr, 8));  // Output: Error: Index out of bounds
console.log(getElementAtIndex(arr, -1)); // Output: Error: Index out of bounds
