export default function Navbar() {
  const menu = ["Giới thiệu", "Kỹ năng", "Mục tiêu", "Liên hệ"];
  return (
    <nav className="flex justify-around p-4 border-b bg-white sticky top-0 z-10">
      {menu.map((item, index) => (
        <a key={index} href="#" className="font-medium hover:text-red-500">
          {item}
        </a>
      ))}
    </nav>
  );
}
