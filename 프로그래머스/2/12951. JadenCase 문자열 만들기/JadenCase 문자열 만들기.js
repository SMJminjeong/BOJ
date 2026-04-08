function solution(s) {
    var answer = '';
    var words = s.split(" ");
    var result = [];
    
    for (var word of words) {
        if(word === "") {
            result.push("");
        } else if (word[0].match(/[a-zA-Z]/)) {
            result.push(word[0].toUpperCase() + word.slice(1).toLowerCase());
        } else {
            result.push(word[0] + word.slice(1).toLowerCase());
        }
    }
    answer = result.join(" ");
    return answer;
}