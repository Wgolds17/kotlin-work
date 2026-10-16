// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(uneditedText: String, redactedText: String, character: Char = 'X'): String {
    return uneditedText.replace(redactedText, character.toString().repeat(redactedText.length))
}