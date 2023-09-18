# Biểu thức chính quy (Regular Expression, regex hoặc regexp) trong Java là một công cụ mạnh mẽ để tìm kiếm, so khớp, và xử lý các chuỗi văn bản theo các mẫu cụ thể. Regex cho phép bạn thực hiện các nhiệm vụ như tìm kiếm các từ cụ thể, kiểm tra định dạng chuỗi, và trích xuất thông tin từ văn bản. Trong Java, regex được hỗ trợ thông qua gói java.util.regex.

- Dưới đây là một số khái niệm cơ bản và ví dụ về cách sử dụng regex trong Java:

1. Các ký tự đặc biệt:
   .: So khớp với bất kỳ ký tự nào (ngoại trừ ký tự xuống dòng).
   \*: So khớp với 0 hoặc nhiều lần của ký tự trước đó.
   +: So khớp với ít nhất một lần của ký tự trước đó.
   ?: So khớp với 0 hoặc 1 lần của ký tự trước đó.
   []: Định nghĩa một tập hợp các ký tự có thể so khớp (ví dụ: [aeiou]).

2. Ký tự đặc biệt cho vị trí:
   ^: Bắt đầu của chuỗi.
   $: Kết thúc của chuỗi.
   \b: Biên giữa các từ (word boundary).
   \B: Không phải biên giữa các từ.

3. Phạm vi và lặp lại:
   {n}: So khớp chính xác n lần.
   {n,}: So khớp ít nhất n lần.
   {n,m}: So khớp ít nhất n lần và nhiều nhất m lần.

4. Ký tự trescape:
   Để tìm kiếm các ký tự đặc biệt như ., \*, +, bạn cần sử dụng \ trước chúng (ví dụ: \\.).

5. Grơ-đô (Groups):
   Bạn có thể sử dụng ngoặc đơn () để tạo nhóm và xác định các phần của biểu thức bạn muốn trích xuất sau khi so khớp.
