package algorithm.string

class LeetCode929 {
    fun numUniqueEmails(emails: Array<String>): Int {
        //["test.email+alex@leetcode.com","test.email.leet+alex@code.com"]
        val set = mutableSetOf<String>()
        emails.forEach {
            val localName = it.substringBefore('@').replace(".", "").substringBefore('+')
            val domain = it.substringAfter('@')
            set.add("$localName@$domain")
        }
        return set.size
    }

}