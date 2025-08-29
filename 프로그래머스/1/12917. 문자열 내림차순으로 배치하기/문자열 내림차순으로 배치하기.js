function solution(s) {
    var answer = '';
    const newArray = s.split("").sort((a,b) => a < b ? 1 : -1).join("");
    answer = newArray;
    
    return answer;
}