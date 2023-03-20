class WordDictionary(object):

    def __init__(self):
        self.words = {}

    def addWord(self, word):
        self.words[word] = 1

    def search(self, word):
        if "." not in word:
            return word in self.words

        for w in self.words:
            cnt = 0
            if len(w) != len(word):
                continue
            for i, str in enumerate(w):
                # . 이면 통과
                if word[i] == "." or word[i] == str:
                    cnt += 1
                else:
                    break
            if cnt == len(word):
                return True