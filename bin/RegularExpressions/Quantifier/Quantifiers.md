Trong biểu thức chính quy (regular expressions hoặc regex), quantifiers là các ký tự đặc biệt được sử dụng để xác định số lượng lặp lại của một mẫu. Quantifiers cho phép bạn chỉ định một số lần cụ thể mà một ký tự hoặc một nhóm ký tự có thể xuất hiện trong chuỗi.

Dưới đây là một số quantifiers cơ bản trong regex:

1. \*: So khớp với 0 hoặc nhiều lần của ký tự hoặc nhóm ký tự trước đó. Ví dụ: a\_ so khớp với "a", "aa", "aaa", vv...

2. +: So khớp với ít nhất một lần của ký tự hoặc nhóm ký tự trước đó. Ví dụ: a+ so khớp với "a", "aa", "aaa", vv... nhưng không so khớp với chuỗi rỗng.

3. ?: So khớp với 0 hoặc 1 lần của ký tự hoặc nhóm ký tự trước đó. Ví dụ: a? so khớp với "a" hoặc chuỗi rỗng.

4. {n}: So khớp chính xác n lần của ký tự hoặc nhóm ký tự trước đó. Ví dụ: a{3} so khớp với "aaa" và không so khớp với "aa" hoặc "a".

5. {n,}: So khớp ít nhất n lần của ký tự hoặc nhóm ký tự trước đó. Ví dụ: a{2,} so khớp với "aa", "aaa", vv...

6. {n,m}: So khớp ít nhất n lần và nhiều nhất m lần của ký tự hoặc nhóm ký tự trước đó. Ví dụ: a{2,4} so khớp với "aa", "aaa", "aaaa" nhưng không so khớp với "a" hoặc "aaaaa".

Ví dụ về sử dụng quantifiers trong regex:

- a\* so khớp với "a", "aa", "aaa", vv...
- \d+ so khớp với một chuỗi gồm ít nhất một chữ số.
- [A-Za-z]{2,4} so khớp với một chuỗi từ 2 đến 4 ký tự chữ cái hoa hoặc thường.
- .+ so khớp với bất kỳ chuỗi nào có ít nhất một ký tự (không so khớp với chuỗi rỗng).

Quantifiers là một phần quan trọng trong việc xác định mẫu chuỗi phức tạp trong regex và giúp bạn thực hiện tìm kiếm và so khớp dễ dàng hơn.
