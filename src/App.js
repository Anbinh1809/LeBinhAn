import Navbar from "./Navbar";
import Intro from "./Intro";
import Skills from "./Skills";
import Goals from "./Goals";

export default function App() {
  return (
    <div className="max-w-md mx-auto bg-white shadow-2xl min-h-screen">
      <Navbar />

      <Intro name="Lê Bình An" birthday="18/09/2008" />
      <Skills />
      <Goals />
      <footer className="p-6 bg-gray-200 rounded-t-3xl">
        <h3 className="font-bold">Kết nối với mình!</h3>
        <p className="text-sm">Email: anbinhle1809@gmail.com</p>
        <p className="text-sm">Sđt: 0775321360</p>
        <p className="text-sm">Địa chỉ: Thành Phố Hồ Chí Minh</p>
      </footer>
    </div>
  );
}
