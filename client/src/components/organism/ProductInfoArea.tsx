import styled from 'styled-components';
import ProductInfoHeader from '../molecule/ProductInfoHeader';
import ProductUserArea from '../molecule/ProductUserArea';
import ProductButtonArea from '../molecule/ProductButtonArea';

type ProductInfo = {
  name: string;
  detail: string;
  mainImg: string;
  categoryName: string;
  tagNames: string[];
  likes: number;
  userName: string;
  userProfileImg: string;
};

const ProductInfoArea = (props: { productInfo: ProductInfo }) => {
  const {
    name,
    detail,
    mainImg,
    categoryName,
    tagNames,
    likes,
    userName,
    userProfileImg,
  } = props.productInfo;

  return (
    <StyledProductInfoArea>
      <ProductInfoHeader
        categoryName={categoryName}
        productName={name}
        tagNames={tagNames}
      />
      <ProductUserArea userName={userName} userProfileImg={userProfileImg} />
      <ProductButtonArea />
    </StyledProductInfoArea>
  );
};

const StyledProductInfoArea = styled.div`
  display: flex;
  flex-direction: column;
  width: 50%;
`;

export default ProductInfoArea;
