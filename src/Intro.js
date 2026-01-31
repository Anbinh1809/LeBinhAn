import myAvatar from "./Rectangle.png";

export default function Intro() {
  return (
    <section id="giớithiệu" className="p-6 space-y-4">
      <div className="bg-gray-300 inline-block px-4 py-1 rounded font-bold shadow-sm">
        Giới thiệu
      </div>

      <div className="flex flex-col items-center">
        <img
          src={myAvatar}
          alt="Lê Bình An"
          className="w-full max-w-sm rounded-lg shadow-md mb-4"
        />

        <div className="w-full text-left space-y-4">
          <div>
            <h3 className="text-xl font-bold">Mình tên Lê Bình An</h3>
            <p className="text-sm text-gray-600 leading-relaxed">
              Là 1 lập trình viên gen Z với niềm đam mê công nghệ. Mình hiện
              đang theo học tại Aptech. Mình đã được học rất nhiều các kiến thức
              ở Aptech từ C, Python, HTML/CSS,...
            </p>
          </div>

          <div className="space-y-2">
            <div className="border-t-2 border-black pt-2 flex justify-between items-center">
              <span className="font-bold text-lg">Ngày sinh</span>
              <span className="text-lg">18/09/2008</span>
            </div>

            <div className="border-t-2 border-black pt-2 flex justify-between items-center">
              <span className="font-bold text-lg">Nghề nghiệp</span>
              <span className="text-lg text-right">Học sinh/sinh viên</span>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
}
