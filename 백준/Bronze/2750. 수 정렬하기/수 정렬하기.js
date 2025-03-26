const input = require("fs")
  .readFileSync("./dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .slice(1)
  .map(Number);



// Selection Sort
for (let i = 0; i < input.length; i++) {
  let minIndex = i;

  for (let j = i + 1; j < input.length; j++) {
    if (input[j] < input[minIndex]) {
      minIndex = j;
    }
  }

  if (minIndex !== i) {
    [input[i], input[minIndex]] = [input[minIndex], input[i]];
  }
}

for (const num of input) {
  console.log(num);
}
