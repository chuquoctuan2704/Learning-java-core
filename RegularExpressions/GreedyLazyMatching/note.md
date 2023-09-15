Trong biểu thức chính quy (regex), Greedy Matching và Lazy Matching là hai cách tiếp cận khác nhau để xác định cách regex nên tìm kiếm và so khớp với văn bản đích.

# Greedy Matching:

- Greedy (tham lam) là mặc định trong regex.
- Khi bạn sử dụng Greedy Matching, regex sẽ cố gắng tìm kiếm và so khớp với một chuỗi dài nhất có thể.
- Ví dụ: Trong biểu thức .\*, dấu \* là toán tử Greedy, và nó sẽ so khớp với chuỗi dài nhất có thể.

# Lazy Matching (Reluctant Matching):

- Lazy (kín đáo) được thực hiện bằng cách thêm dấu hỏi chấm ? sau toán tử lặp lại như \_, +, ?, hoặc {}.
- Khi bạn sử dụng Lazy Matching, regex sẽ cố gắng tìm kiếm và so khớp với một chuỗi ngắn nhất có thể.
- Ví dụ: Trong biểu thức .\*?, dấu \*? là toán tử Lazy, và nó sẽ so khớp với chuỗi ngắn nhất có thể.

Ví dụ:
Với chuỗi "abcabc", biểu thức a._c (Greedy) sẽ khớp với toàn bộ chuỗi "abcabc", trong khi biểu thức a._?c (Lazy) sẽ chỉ khớp với "abc".

Với chuỗi "12345", biểu thức \d+ (Greedy) sẽ khớp với toàn bộ chuỗi "12345", trong khi biểu thức \d+? (Lazy) sẽ chỉ khớp với "1".

Lựa chọn giữa Greedy và Lazy Matching phụ thuộc vào mục đích cụ thể của bạn khi viết biểu thức chính quy. Nếu bạn muốn tìm kiếm chuỗi dài nhất có thể, bạn nên sử dụng Greedy Matching. Ngược lại, nếu bạn muốn tìm kiếm chuỗi ngắn nhất có thể, bạn nên sử dụng Lazy Matching.
