import styled from 'styled-components';
import Box from '../atom/Box';
import ProductList from '../molecule/ProductList';
import ProfileImg from '../atom/ProfileImg';
import Title from '../atom/Title';
import MediumText from '../atom/MediumText';

const products = [
  {
    name: '손선풍기',
    imgSrc: 'https://sitem.ssgcdn.com/91/71/69/item/1000543697191_i1_1100.jpg',
  },
  {
    name: '바인더',
    imgSrc:
      'https://image.brandi.me/cproduct/2022/01/11/SB000000000049857754_1641888259_image1_M.jpeg',
  },
  {
    name: '빔프로젝터',
    imgSrc:
      'https://image9.coupangcdn.com/image/vendor_inventory/8401/f64a86397b47cdb8286f616946a8cb43c4ab0364c762452940664058de73.jpg',
  },
];
const UserProfile = () => {
  return (
    <StyledUserProfile>
      <Box width='1200px'>
        <StyledBox>
          <ProfileWrapper>
            <ProfileImg width='120px' />
            <ProfileDesc>
              <Title text='nickname' size='30px' align='left' />
              <MediumText text='description' />
            </ProfileDesc>
          </ProfileWrapper>
          <Line />
          <ProductList children={products} />
        </StyledBox>
      </Box>
    </StyledUserProfile>
  );
};

const StyledUserProfile = styled.div`
  display: flex;
  text-align: center;
  justify-content: center;
`;

const StyledBox = styled.div`
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  align-self: center;
  padding: 50px;
`;

const ProfileWrapper = styled.div`
  display: flex;
  width: 90%;
  margin-bottom: 20px;
`;

const ProfileDesc = styled.div`
  width: 100%;
  text-align: left;
  margin-left: 30px;
  & > *:not(:last-child) {
    margin-bottom: 10px;
  }
`;

const Line = styled.hr`
  width: 100%;
`;

export default UserProfile;
